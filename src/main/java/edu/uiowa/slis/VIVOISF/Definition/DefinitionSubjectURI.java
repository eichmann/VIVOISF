package edu.uiowa.slis.VIVOISF.Definition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DefinitionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DefinitionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DefinitionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Definition theDefinition = (Definition)findAncestorWithClass(this, Definition.class);
			if (!theDefinition.commitNeeded) {
				pageContext.getOut().print(theDefinition.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Definition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Definition theDefinition = (Definition)findAncestorWithClass(this, Definition.class);
			return theDefinition.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Definition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Definition theDefinition = (Definition)findAncestorWithClass(this, Definition.class);
			theDefinition.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Definition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for subjectURI tag ");
		}
	}
}

