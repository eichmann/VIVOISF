package edu.uiowa.slis.VIVOISF.SubnationalRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SubnationalRegionRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SubnationalRegionRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(SubnationalRegionRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SubnationalRegionRO_0000056Iterator theSubnationalRegionRO_0000056Iterator = (SubnationalRegionRO_0000056Iterator)findAncestorWithClass(this, SubnationalRegionRO_0000056Iterator.class);
			pageContext.getOut().print(theSubnationalRegionRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing SubnationalRegion for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubnationalRegion for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

