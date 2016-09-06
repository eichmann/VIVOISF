package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratorySponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratorySponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratorySponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratorySponsorsIterator theLaboratorySponsorsIterator = (LaboratorySponsorsIterator)findAncestorWithClass(this, LaboratorySponsorsIterator.class);
			pageContext.getOut().print(theLaboratorySponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

