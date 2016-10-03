package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsDistributorIterator theProceedingsDistributorIterator = (ProceedingsDistributorIterator)findAncestorWithClass(this, ProceedingsDistributorIterator.class);
			pageContext.getOut().print(theProceedingsDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for distributor tag ");
		}
		return SKIP_BODY;
	}
}

