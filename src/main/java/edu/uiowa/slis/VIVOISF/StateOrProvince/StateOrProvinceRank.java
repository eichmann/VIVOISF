package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceRank currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceRankIterator theStateOrProvince = (StateOrProvinceRankIterator)findAncestorWithClass(this, StateOrProvinceRankIterator.class);
			pageContext.getOut().print(theStateOrProvince.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for rank tag ");
		}
		return SKIP_BODY;
	}
}

