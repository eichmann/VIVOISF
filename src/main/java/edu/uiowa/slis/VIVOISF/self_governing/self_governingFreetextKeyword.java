package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingFreetextKeywordIterator theself_governing = (self_governingFreetextKeywordIterator)findAncestorWithClass(this, self_governingFreetextKeywordIterator.class);
			pageContext.getOut().print(theself_governing.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

