package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCodeUNDPIterator theterritory = (territoryCodeUNDPIterator)findAncestorWithClass(this, territoryCodeUNDPIterator.class);
			pageContext.getOut().print(theterritory.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

