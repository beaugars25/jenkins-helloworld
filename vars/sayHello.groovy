cat > vars/sayHello.groovy <<'EOF'
def call(String name = 'World') {
    echo "Hello, ${name}!"
}
EOF

