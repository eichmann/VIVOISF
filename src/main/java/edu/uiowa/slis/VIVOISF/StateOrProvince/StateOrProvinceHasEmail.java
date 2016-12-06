package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasEmailIterator theStateOrProvinceHasEmailIterator = (StateOrProvinceHasEmailIterator)findAncestorWithClass(this, StateOrProvinceHasEmailIterator.class);
			pageContext.getOut().print(theStateOrProvinceHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

