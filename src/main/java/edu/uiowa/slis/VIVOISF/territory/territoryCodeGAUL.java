package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCodeGAULIterator theterritory = (territoryCodeGAULIterator)findAncestorWithClass(this, territoryCodeGAULIterator.class);
			pageContext.getOut().print(theterritory.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

