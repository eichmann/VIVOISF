package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148FreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148FreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148FreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148FreetextKeywordIterator theBFO_0000148 = (BFO_0000148FreetextKeywordIterator)findAncestorWithClass(this, BFO_0000148FreetextKeywordIterator.class);
			pageContext.getOut().print(theBFO_0000148.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

