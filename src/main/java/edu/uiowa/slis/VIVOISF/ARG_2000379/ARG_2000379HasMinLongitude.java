package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379HasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379HasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379HasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379HasMinLongitudeIterator theARG_2000379 = (ARG_2000379HasMinLongitudeIterator)findAncestorWithClass(this, ARG_2000379HasMinLongitudeIterator.class);
			pageContext.getOut().print(theARG_2000379.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

