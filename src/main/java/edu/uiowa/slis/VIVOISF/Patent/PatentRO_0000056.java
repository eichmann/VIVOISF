package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentRO_0000056Iterator thePatentRO_0000056Iterator = (PatentRO_0000056Iterator)findAncestorWithClass(this, PatentRO_0000056Iterator.class);
			pageContext.getOut().print(thePatentRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

