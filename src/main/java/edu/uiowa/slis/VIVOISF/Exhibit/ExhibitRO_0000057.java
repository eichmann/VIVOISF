package edu.uiowa.slis.VIVOISF.Exhibit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExhibitRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExhibitRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExhibitRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExhibitRO_0000057Iterator theExhibitRO_0000057Iterator = (ExhibitRO_0000057Iterator)findAncestorWithClass(this, ExhibitRO_0000057Iterator.class);
			pageContext.getOut().print(theExhibitRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing Exhibit for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Exhibit for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

