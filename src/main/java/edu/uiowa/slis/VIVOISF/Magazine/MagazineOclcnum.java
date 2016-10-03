package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineOclcnumIterator theMagazine = (MagazineOclcnumIterator)findAncestorWithClass(this, MagazineOclcnumIterator.class);
			pageContext.getOut().print(theMagazine.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

