# 트리 깊이 최대 1,000 → 파이썬 기본 재귀 한도(1,000)에 걸릴 수 있어서 늘림
# ㄴ 아직 정확하게 이해하지 못했습니다..! 
# 문제 겨우겨우 다 이해했는데 ai가 얘기한 것입니다..!
# 이해한 후에 설명을 작성하겠습니다.
import sys
sys.setrecursionlimit(10**6)

# 이진트리 노드. 트리 모양을 만든 뒤엔 y가 필요 없어서 x와 번호만 저장
class Node:
    def __init__(self, x, num):
        self.x = x          # 왼쪽/오른쪽 판단 기준
        self.num = num      # 노드 번호 (정답 출력용)
        self.left = None    # 왼쪽 자식
        self.right = None   # 오른쪽 자식

# 루트부터 내려가며 x가 작으면 왼쪽 서브트리, 크면 오른쪽 서브트리. 
# 빈 자리를 만나면 매달고 끝
def insert(root, new):
    cur = root
    while True:
        if new.x < cur.x:              # 왼쪽 서브트리로
            if cur.left is None:       # 비어 있으면 여기에 연결
                cur.left = new
                return
            cur = cur.left             # 아니면 한 칸 내려가서 반복
        else:                          # 오른쪽 서브트리로
            if cur.right is None:
                cur.right = new
                return
            cur = cur.right

# 전위순회란 나-> 왼쪽 -> 오른쪽
def preorder(node, result):
    if node is None:                   # 재귀 종료 조건
        return
    result.append(node.num)
    preorder(node.left, result)
    preorder(node.right, result)

# 후위순회란 왼쪽 -> 오른쪽 -> 나
def postorder(node, result):
    if node is None:
        return
    postorder(node.left, result)
    postorder(node.right, result)
    result.append(node.num)


def solution(nodeinfo):
    # 1. 정렬하면 원래 순서(=번호)를 잃으니까, 번호를 먼저 붙인다 → (x, y, 번호)
    nodes = [(x, y, i + 1) for i, (x, y) in enumerate(nodeinfo)]

    # 2. y 내림차순(위층부터), 같으면 x 오름차순
    #    → 이 순서대로 넣으면 부모가 항상 자식보다 먼저 트리에 들어감
    nodes.sort(key=lambda n: (-n[1], n[0]))

    # 3. y가 가장 큰 노드가 루트
    root = Node(nodes[0][0], nodes[0][2])

    # 4. 나머지 노드를 차례로 트리에 매단다
    for x, y, num in nodes[1:]:
        insert(root, Node(x, num))

    # 5. 순회 함수가 리스트를 채움 (리턴값 없음)
    pre, post = [], []
    preorder(root, pre)
    postorder(root, post)

    return [pre, post]