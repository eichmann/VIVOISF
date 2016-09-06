package edu.uiowa.slis.VIVOISF.Definition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DefinitionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DefinitionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DefinitionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Definition theDefinition = (Definition)findAncestorWithClass(this, Definition.class);
			if (!theDefinition.commitNeeded) {
				pageContext.getOut().print(theDefinition.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Definition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Definition theDefinition = (Definition)findAncestorWithClass(this, Definition.class);
			return theDefinition.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Definition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Definition theDefinition = (Definition)findAncestorWithClass(this, Definition.class);
			theDefinition.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Definition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for label tag ");
		}
	}
}

