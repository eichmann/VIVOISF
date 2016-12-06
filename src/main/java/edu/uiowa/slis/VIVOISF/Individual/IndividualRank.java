package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualRank currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualRankIterator theIndividual = (IndividualRankIterator)findAncestorWithClass(this, IndividualRankIterator.class);
			pageContext.getOut().print(theIndividual.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for rank tag ");
		}
		return SKIP_BODY;
	}
}

