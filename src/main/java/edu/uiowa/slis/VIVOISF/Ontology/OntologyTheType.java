package edu.uiowa.slis.VIVOISF.Ontology;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologyTheType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OntologyTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologyTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OntologyTheTypeIterator theOntology = (OntologyTheTypeIterator)findAncestorWithClass(this, OntologyTheTypeIterator.class);
			pageContext.getOut().print(theOntology.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for theType tag ");
		}
		return SKIP_BODY;
	}
}

