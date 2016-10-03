package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineSici currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineSiciIterator theMagazine = (MagazineSiciIterator)findAncestorWithClass(this, MagazineSiciIterator.class);
			pageContext.getOut().print(theMagazine.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for sici tag ");
		}
		return SKIP_BODY;
	}
}

