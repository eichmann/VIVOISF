package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineDistributorIterator theMagazineDistributorIterator = (MagazineDistributorIterator)findAncestorWithClass(this, MagazineDistributorIterator.class);
			pageContext.getOut().print(theMagazineDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for distributor tag ");
		}
		return SKIP_BODY;
	}
}

