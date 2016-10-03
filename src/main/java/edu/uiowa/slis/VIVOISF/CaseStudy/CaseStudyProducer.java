package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyProducerIterator theCaseStudyProducerIterator = (CaseStudyProducerIterator)findAncestorWithClass(this, CaseStudyProducerIterator.class);
			pageContext.getOut().print(theCaseStudyProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for producer tag ");
		}
		return SKIP_BODY;
	}
}

