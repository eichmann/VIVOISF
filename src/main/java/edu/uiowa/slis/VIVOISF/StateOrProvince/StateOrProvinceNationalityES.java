package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNationalityESIterator theStateOrProvince = (StateOrProvinceNationalityESIterator)findAncestorWithClass(this, StateOrProvinceNationalityESIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

