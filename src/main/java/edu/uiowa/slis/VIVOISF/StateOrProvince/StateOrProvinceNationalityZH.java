package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNationalityZHIterator theStateOrProvince = (StateOrProvinceNationalityZHIterator)findAncestorWithClass(this, StateOrProvinceNationalityZHIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

