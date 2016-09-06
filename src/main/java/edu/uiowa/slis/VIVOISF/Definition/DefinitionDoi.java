package edu.uiowa.slis.VIVOISF.Definition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DefinitionDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DefinitionDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(DefinitionDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DefinitionDoiIterator theDefinition = (DefinitionDoiIterator)findAncestorWithClass(this, DefinitionDoiIterator.class);
			pageContext.getOut().print(theDefinition.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Definition for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for doi tag ");
		}
		return SKIP_BODY;
	}
}

