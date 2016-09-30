package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class OBI_0000272 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272 currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			OBI_0000272Iterator theOBI_0000272Iterator = (OBI_0000272Iterator) findAncestorWithClass(this, OBI_0000272Iterator.class);

			if (theOBI_0000272Iterator != null) {
				subjectURI = theOBI_0000272Iterator.getSubjectURI();
				label = theOBI_0000272Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Organization.OrganizationERO_0000031Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Organization.OrganizationERO_0000031Iterator)this.getParent()).getERO_0000031();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000481Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000481Iterator)this.getParent()).getERO_0000481();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000481Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000481Iterator)this.getParent()).getERO_0000481();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000038InverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000038InverseIterator)this.getParent()).getERO_0000038Inverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000038InverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000038InverseIterator)this.getParent()).getERO_0000038Inverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000038InverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000038InverseIterator)this.getParent()).getERO_0000038Inverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000038InverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000038InverseIterator)this.getParent()).getERO_0000038Inverse();
			}

			edu.uiowa.slis.VIVOISF.Organization.OrganizationERO_0000031Iterator theOrganizationERO_0000031Iterator = (edu.uiowa.slis.VIVOISF.Organization.OrganizationERO_0000031Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Organization.OrganizationERO_0000031Iterator.class);

			if (subjectURI == null && theOrganizationERO_0000031Iterator != null) {
				subjectURI = theOrganizationERO_0000031Iterator.getERO_0000031();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000481Iterator theERO_0000005ERO_0000481Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000481Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000481Iterator.class);

			if (subjectURI == null && theERO_0000005ERO_0000481Iterator != null) {
				subjectURI = theERO_0000005ERO_0000481Iterator.getERO_0000481();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000481Iterator theERO_0000014ERO_0000481Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000481Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000014.ERO_0000014ERO_0000481Iterator.class);

			if (subjectURI == null && theERO_0000014ERO_0000481Iterator != null) {
				subjectURI = theERO_0000014ERO_0000481Iterator.getERO_0000481();
			}

			if (theOBI_0000272Iterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in OBI_0000272 doStartTag", e);
			throw new JspTagException("Exception raised in OBI_0000272 doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in OBI_0000272 doEndTag", e);
			throw new JspTagException("Exception raised in OBI_0000272 doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
