import yaml
import io

# Define data
# data = {'a list': [1, 42, 3.141, 1337, 'help', u'€'],
#         'a string': 'bla',
#         'another dict': {'foo': 'bar',
#                          'key': 'value',
#                          'the answer': 42}}
#
# # Write YAML file
# with io.open('data.yaml', 'w', encoding='utf8') as outfile:
#     yaml.dump(data, outfile, default_flow_style=False, allow_unicode=True)

# Read YAML file
with open("data.yaml", 'r') as stream:
    data_loaded = yaml.load(stream)
print(data_loaded['a list'])
data_loaded['a list']
actions  =  data_loaded['a list']
result = list(filter(lambda x: x['action'] == 'update', actions))
print(result)
expectedResult = [d for d in actions if d['action'] == 'create']
print(expectedResult)
#print(data == data_loaded)