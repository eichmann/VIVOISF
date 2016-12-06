package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameCurrencyZHIterator thePostdocPosition = (PostdocPositionNameCurrencyZHIterator)findAncestorWithClass(this, PostdocPositionNameCurrencyZHIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

