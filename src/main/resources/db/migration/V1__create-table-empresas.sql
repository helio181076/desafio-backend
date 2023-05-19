CREATE TABLE empresas(
   id SERIAL PRIMARY KEY,
   cnpj TEXT NOT NULL,
   cep TEXT NOT NULL,
   nomefantasia TEXT
);

CREATE TABLE fornecedores(
   id SERIAL PRIMARY KEY,
   cnpjcpf TEXT NOT NULL,
   nome TEXT NOT NULL,
   email TEXT NOT NULL,
   cep TEXT NOT NULL
);