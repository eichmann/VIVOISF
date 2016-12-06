package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualUrlIterator theIndividual = (IndividualUrlIterator)findAncestorWithClass(this, IndividualUrlIterator.class);
			pageContext.getOut().print(theIndividual.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for url tag ");
		}
		return SKIP_BODY;
	}
}

