package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameOfficialENIterator thePrimaryPosition = (PrimaryPositionNameOfficialENIterator)findAncestorWithClass(this, PrimaryPositionNameOfficialENIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

