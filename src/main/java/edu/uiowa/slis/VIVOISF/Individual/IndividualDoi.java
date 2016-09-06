package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualDoiIterator theIndividual = (IndividualDoiIterator)findAncestorWithClass(this, IndividualDoiIterator.class);
			pageContext.getOut().print(theIndividual.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for doi tag ");
		}
		return SKIP_BODY;
	}
}

