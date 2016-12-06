package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCodeISO3Iterator theterritory = (territoryCodeISO3Iterator)findAncestorWithClass(this, territoryCodeISO3Iterator.class);
			pageContext.getOut().print(theterritory.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

