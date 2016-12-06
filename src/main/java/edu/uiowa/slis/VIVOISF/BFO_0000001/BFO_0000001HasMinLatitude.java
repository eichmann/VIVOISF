package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001HasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001HasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001HasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001HasMinLatitudeIterator theBFO_0000001 = (BFO_0000001HasMinLatitudeIterator)findAncestorWithClass(this, BFO_0000001HasMinLatitudeIterator.class);
			pageContext.getOut().print(theBFO_0000001.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

