package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameCurrencyESIterator thePostdocPosition = (PostdocPositionNameCurrencyESIterator)findAncestorWithClass(this, PostdocPositionNameCurrencyESIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

