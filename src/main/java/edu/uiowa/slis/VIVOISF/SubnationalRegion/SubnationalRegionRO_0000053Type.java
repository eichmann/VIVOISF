package edu.uiowa.slis.VIVOISF.SubnationalRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SubnationalRegionRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SubnationalRegionRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SubnationalRegionRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SubnationalRegionRO_0000053Iterator theSubnationalRegionRO_0000053Iterator = (SubnationalRegionRO_0000053Iterator)findAncestorWithClass(this, SubnationalRegionRO_0000053Iterator.class);
			pageContext.getOut().print(theSubnationalRegionRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SubnationalRegion for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubnationalRegion for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

