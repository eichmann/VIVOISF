package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCodeGAULIterator theself_governing = (self_governingCodeGAULIterator)findAncestorWithClass(this, self_governingCodeGAULIterator.class);
			pageContext.getOut().print(theself_governing.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

