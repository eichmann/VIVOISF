package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCodeGAULIterator thegeographical_region = (geographical_regionCodeGAULIterator)findAncestorWithClass(this, geographical_regionCodeGAULIterator.class);
			pageContext.getOut().print(thegeographical_region.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

