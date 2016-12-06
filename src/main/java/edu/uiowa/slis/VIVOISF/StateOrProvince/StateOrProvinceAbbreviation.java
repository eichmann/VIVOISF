package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			if (!theStateOrProvince.commitNeeded) {
				pageContext.getOut().print(theStateOrProvince.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			return theStateOrProvince.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing StateOrProvince for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			theStateOrProvince.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for abbreviation tag ");
		}
	}
}

