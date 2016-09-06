package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			if (!thePublisher.commitNeeded) {
				pageContext.getOut().print(thePublisher.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			return thePublisher.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Publisher for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			thePublisher.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for subjectURI tag ");
		}
	}
}

