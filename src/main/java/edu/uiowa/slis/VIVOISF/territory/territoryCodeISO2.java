package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCodeISO2Iterator theterritory = (territoryCodeISO2Iterator)findAncestorWithClass(this, territoryCodeISO2Iterator.class);
			pageContext.getOut().print(theterritory.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

