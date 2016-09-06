package edu.uiowa.slis.VIVOISF.County;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountyRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountyRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(CountyRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountyRO_0000053Iterator theCountyRO_0000053Iterator = (CountyRO_0000053Iterator)findAncestorWithClass(this, CountyRO_0000053Iterator.class);
			pageContext.getOut().print(theCountyRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing County for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing County for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

