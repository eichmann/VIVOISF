package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameCurrencyITIterator thePostdocPosition = (PostdocPositionNameCurrencyITIterator)findAncestorWithClass(this, PostdocPositionNameCurrencyITIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

