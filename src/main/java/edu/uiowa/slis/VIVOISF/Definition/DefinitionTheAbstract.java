package edu.uiowa.slis.VIVOISF.Definition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DefinitionTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DefinitionTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(DefinitionTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DefinitionTheAbstractIterator theDefinition = (DefinitionTheAbstractIterator)findAncestorWithClass(this, DefinitionTheAbstractIterator.class);
			pageContext.getOut().print(theDefinition.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Definition for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

