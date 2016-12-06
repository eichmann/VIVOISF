package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territorySource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territorySource currentInstance = null;
	private static final Log log = LogFactory.getLog(territorySource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territorySourceIterator theterritory = (territorySourceIterator)findAncestorWithClass(this, territorySourceIterator.class);
			pageContext.getOut().print(theterritory.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for source tag ");
		}
		return SKIP_BODY;
	}
}

