package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptDistributorIterator theManuscriptDistributorIterator = (ManuscriptDistributorIterator)findAncestorWithClass(this, ManuscriptDistributorIterator.class);
			pageContext.getOut().print(theManuscriptDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for distributor tag ");
		}
		return SKIP_BODY;
	}
}

