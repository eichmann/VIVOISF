package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeIAO_0000136Iterator theCodeIAO_0000136Iterator = (CodeIAO_0000136Iterator)findAncestorWithClass(this, CodeIAO_0000136Iterator.class);
			pageContext.getOut().print(theCodeIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

