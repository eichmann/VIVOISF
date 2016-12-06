package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceFreetextKeywordIterator theStateOrProvince = (StateOrProvinceFreetextKeywordIterator)findAncestorWithClass(this, StateOrProvinceFreetextKeywordIterator.class);
			pageContext.getOut().print(theStateOrProvince.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

