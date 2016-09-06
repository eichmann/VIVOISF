package edu.uiowa.slis.VIVOISF.AwardedDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardedDegreeRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardedDegreeRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardedDegreeRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardedDegreeRO_0000056Iterator theAwardedDegreeRO_0000056Iterator = (AwardedDegreeRO_0000056Iterator)findAncestorWithClass(this, AwardedDegreeRO_0000056Iterator.class);
			pageContext.getOut().print(theAwardedDegreeRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AwardedDegree for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardedDegree for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

