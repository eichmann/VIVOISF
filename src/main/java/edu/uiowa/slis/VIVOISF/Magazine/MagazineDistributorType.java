package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineDistributorIterator theMagazineDistributorIterator = (MagazineDistributorIterator)findAncestorWithClass(this, MagazineDistributorIterator.class);
			pageContext.getOut().print(theMagazineDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for distributor tag ");
		}
		return SKIP_BODY;
	}
}

