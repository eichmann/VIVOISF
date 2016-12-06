package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameShortENIterator thePrimaryPosition = (PrimaryPositionNameShortENIterator)findAncestorWithClass(this, PrimaryPositionNameShortENIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

