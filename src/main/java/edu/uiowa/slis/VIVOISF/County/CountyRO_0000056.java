package edu.uiowa.slis.VIVOISF.County;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountyRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountyRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(CountyRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountyRO_0000056Iterator theCountyRO_0000056Iterator = (CountyRO_0000056Iterator)findAncestorWithClass(this, CountyRO_0000056Iterator.class);
			pageContext.getOut().print(theCountyRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing County for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing County for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

