package edu.uiowa.slis.VIVOISF.BFO_0000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000008FreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000008FreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000008FreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000008FreetextKeywordIterator theBFO_0000008 = (BFO_0000008FreetextKeywordIterator)findAncestorWithClass(this, BFO_0000008FreetextKeywordIterator.class);
			pageContext.getOut().print(theBFO_0000008.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000008 for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000008 for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

