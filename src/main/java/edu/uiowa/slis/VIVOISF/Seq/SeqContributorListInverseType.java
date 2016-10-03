package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqContributorListInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqContributorListInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqContributorListInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeqContributorListInverseIterator theSeqContributorListInverseIterator = (SeqContributorListInverseIterator)findAncestorWithClass(this, SeqContributorListInverseIterator.class);
			pageContext.getOut().print(theSeqContributorListInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

